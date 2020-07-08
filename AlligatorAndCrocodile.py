#!/usr/bin/env python3

"""
DIVE DEEP

print(response.status_code) >>> 200

print(type(response)) >>> class 'requests.models.Response' 

print(type(response.json)) >>> class 'method' 

print(type(setUp)) >>>  class 'str' 

"""

import requests
import json
import time
import pyfiglet
from tqdm import tqdm


def showIntro():
    print()
    result = pyfiglet.figlet_format(
        "Alligator and Crocodile", font="digital", justify="center")

    print(result)

    print('''
    \t\t\tWecome to Florida SaltWater!
    Today, Alligator and Crocodile are having a little fun telling a joke.
    ''')


showIntro()



def playGame():

    response = requests.get("https://official-joke-api.appspot.com/random_joke")

    setUp = response.json().get("setup")
    punchline = response.json().get("punchline")
  
    print("\nAlligator asks: \t" + setUp)
    time.sleep(2)
    
    print()
    for i in tqdm(range(0,5), desc= "Crocodile is Thinking..."):
        time.sleep(1)

    punchline = response.json().get("punchline")
    print("\n\n")
    print("Alligator replies: \t" + punchline)
    time.sleep(2)

    print()
    for i in tqdm(range(0, 5), desc="Crocodile is ROFL..."):
        time.sleep(1)
   
    playAgain = input("\nLet's play (Again) [Y/n]\t")
    while playAgain == "Y" or playAgain == "y" or playAgain == "yes":
        playGame()
        break
    else:
        endGame()


def endGame():
    end = pyfiglet.figlet_format(
        "Game Over", font="digital", justify="center")
    print()
    print(end)
    print('''\n\tSee you later Alligator! \tAfter a while Crocodile!\n''')

askPlayer = input("Do you want to hear their interesting conversation? [Y/n]\t")

if askPlayer == "Y" or askPlayer == "y" or askPlayer == "yes":
    playGame()
else:
    endGame()


