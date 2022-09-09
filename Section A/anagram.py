# -*- coding: utf-8 -*-
"""
Created on Wed Sep  7 20:00:48 2022

@author: Abrish
"""

class Solution:
       def groupAnagrams(self, strs):
      result = {}
      for i in strs:
         x = "".join(sorted())
         if x in result:
            result[x].append(i)
         else:
            result[x] = [i]
      return list(result.values())
ob1 = Solution()
print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))


# =============================================================================
# The code above was presented for a review by a hypothetical student


# Errors that need to be corrected
# ---------------------------------

# Firstly, when running your code I have receive an Indentation Error in 
# line 10. To fix this you will have to move 3 spaces back. I would 
# recommend always pressing enter after creating a class to avoid any 
# indentation errors.

# To ensure the program does the specific task you will need to add "not" 
# to line 29. What this will do is make sure that it will NOT add any 
# anagrams to the dictionary if the string is not a real word.

# In line 34 you will need to add the "+" (plus sign) next to the “=” 
# (equals sign). This will add the different anagrams to the dictionary.

# The style and documentation of your task is good however the correctness 
# and the efficiency of your code needs some work.

# Positive aspects
# ----------------

# You have shown a great understanding of the task as you have managed 
# to create a class, a dictionary and a for loop. You were also able to 
# correctly make use of the if – else statement and were able to call and 
# print the functions. You will just need to make sure you always check 
# for indentation errors and better your understanding on where and how 
# to correctly use operators. Most importantly, always write comments on 
# your code. This will help you grow as a developer and not only help you, 
# but others understand your code.
# I have attached a file called Python Task.py which has the solution 
# for this task, happy coding! 



