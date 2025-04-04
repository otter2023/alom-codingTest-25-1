import sys
input = sys.stdin.readline
from collections import deque
n , m = map(int, input().strip().split(" "))

#map을 이용해야하나?
nodes = []
for i in range(n+1) :
    tmp = {
        'acable' : []
    }
    nodes.append(tmp)
nodes[0] = 0

for i in range(m) :
    a,b = map(int, input().strip().split(" "))
    nodes[b]['acable'].append(a) #b->a 해킹 ㄱㄴ


    

Q = deque()
for i in range(1,n+1) :
    if i == 2 :
        print()
    for j in (nodes[i]['acable']) :
        Q.append(([i], j))
    while Q :
        tmpList, obj = Q.popleft()
        for k in range(len(tmpList)-1) :
            if obj not in nodes[tmpList[k]]['acable']:
                nodes[tmpList[k]]['acable'].append(obj)
        tmpList.append(obj)
        for k in (nodes[obj]['acable']) :
            if k not in nodes[tmpList[0]]['acable'] :
                Q.append((tmpList , k))
    
cnt = 0
prtList = []
for i in range(1,n+1) :
    k = len(nodes[i]['acable'])
    if k >= cnt :
        cnt = k
        if k > cnt :
            prtList = []
        prtList.append(i)
    
for i in prtList :
    print(i, end= ' ')