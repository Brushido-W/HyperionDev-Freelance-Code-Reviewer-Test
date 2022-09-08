# -*- coding: utf-8 -*-
"""
Created on Wed Sep  7 19:33:54 2022

@author: Abrish
"""

class Solution():
   # corrected indentation error in line 10
   def groupAnagrams(self, strs):
       '''
       Function to group Anograms
       
       Parameter 
       ----------
       strs : list of words

       Returns
       -------
       list of grouped anagrams.
       
       '''
       result = {}
       for i in strs:
           x = ''.join(sorted(i))
           # added "not" to line 29
           # if the rearaged word is not in the a real word, the original
           # word remains
           if x not in result:
               result[x] = [i]
           else:
               # insert "+" to line 34
               # this will add the different Anograms to the list
               result[x] += [i]
       return list(result.values())

ob1 = Solution()
# call function to group and solve Anagram then print values
print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))




