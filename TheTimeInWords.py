#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the timeInWords function below.
def timeInWords(h, m):
    nw=["zero", 
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twenty one",
        "twenty two",
        "twenty three",
        "twenty four",
        "twenty five",
        "twenty six",
        "twenty seven",
        "twenty eight",
        "twenty nine"]
    if (m==0):
        return " ".join([nw[h],"o' clock"])
    elif(m==15):
        return " ".join(["quarter past",nw[h]])
    elif(m==30):
        return " ".join(["half past",nw[h]])
    elif(m==45):
        return " ".join(["quarter to",nw[h+1]])
    elif(m==1):
        return " ".join([nw[m],"minute past",nw[h]])
    elif(m<30):
        return " ".join([nw[m],"minutes past",nw[h]])
    elif(m>30):
        return " ".join([nw[30-m],"minutes to",nw[h+1]])
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    h = int(input())

    m = int(input())

    result = timeInWords(h, m)

    fptr.write(result + '\n')

    fptr.close()
