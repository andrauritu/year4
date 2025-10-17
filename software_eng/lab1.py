from transformers import AutoTokenizer, AutoModelForCausalLM
import torch

# --- change these two each run ---
model_name = "distilbert/distilgpt2"     # or "openai-community/gpt2", or "Qwen/Qwen2-1.5B-Instruct"
temperature = 0.7                        # try 0.2, 0.7, 1.2
# ----------------------------------

tokenizer = AutoTokenizer.from_pretrained(model_name)
model = AutoModelForCausalLM.from_pretrained(model_name)

device = "cuda" if torch.cuda.is_available() else "cpu"
model.to(device)

prompt = "Today I learned how to run a local LLM because"
inputs = tokenizer(prompt, return_tensors="pt").to(device)

with torch.no_grad():
    output = model.generate(
        **inputs,
        max_new_tokens=50,
        pad_token_id=tokenizer.eos_token_id,
        # extra sampling knobs:
        do_sample=True,
        temperature=temperature,
        top_p=0.9,
        top_k=50,
        repetition_penalty=1.1,
    )

print(tokenizer.decode(output[0], skip_special_tokens=True))
