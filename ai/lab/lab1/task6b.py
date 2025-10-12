def do_stuff(str_arg):
    words = str_arg.split()
    return words[1] + " " + words[-1] 

if __name__ == '__main__':
    str_arg = 'The AI journey is the perfect opportunity to expand one`s horizons.'
    result = do_stuff(str_arg)
    print(result)
