from django.shortcuts import render
from .models import PersonalInfo

def home(request):
    personal_info = PersonalInfo.objects.first()  # Get the first (and likely only) record
    return render(request, 'homepage/index.html', {'personal_info': personal_info})