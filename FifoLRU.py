# # Author: Aaditya Badve
# this program is to show LRU and FIFO algorithm used while caching.
# Input: txt file giving page references per line.
#        size of cache.
from collections import deque
import sys
def fifo(pageReference, cacheSize):
    cache = deque(maxlen=cacheSize)
    currentSize = 0
    for page in pageReference:
        if cache.count(page) >= 1:
            print "Hit" , page
        elif currentSize < cacheSize:
            cache.append(page)
            currentSize += 1 
            print "Miss", page
        else:
            print "Miss" , page , "evicting" , cache.popleft() # evicting last element in queue
            cache.append(page)    

def lru(pageReference, cacheSize):
    cache = deque(maxlen=cacheSize)
    currentSize = 0
    for page in pageReference:
        if cache.count(page) >= 1:
            cache.remove(page)
            cache.append(page); # adding to end of cache
            print "Hit" , page
        elif currentSize < cacheSize:
            cache.append(page)
            currentSize += 1
            print "Miss", page
        else:
            print "Miss" , page , "evicting" , cache.popleft()
            cache.append(page)    

def startProcess():
    if len(sys.argv) != 4:
        print "program needs three arguments: replacement-policy(fifo/lru), cache size , file name"
        return
    file = open(sys.argv[3]).readlines()
    pagePreference = []
    for line in file:
        pagePreference.append(int(line[:-1]))
    cacheSize = int(sys.argv[2])
    if sys.argv[1] == "fifo":
        fifo(pagePreference, cacheSize)
    elif sys.argv[1] == "lru":
        lru(pagePreference, cacheSize)

startProcess()
