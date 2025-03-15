## 스택

class Stack:
    def __init__(self):
        self.stack=[]
    
    def push(self,element):
        self.stack.append(element)
        return(element)
    
    def pop(self):
        if self.stack:
            return self.stack.pop()
        else:
            return -1
    def size(self):
        return len(self.stack)
    
    def empty(self):
        if self.stack: ## 스택에 원소가 존재할때
            return 0
        else: ## 스택이 비어있을 때
            return 1
        
    def top(self):
        if self.stack:
            return self.stack[-1]
        else:
            return -1

def stack_command(s,command):
    commands=command.split() ## push 인 경우 element 입력
    cmd=commands[0]

    if(cmd=="push"):
        element=int(commands[1])
        result=s.push(element)
        return result
    
    elif(cmd=="pop"):
        result=s.pop()
        return result
    
    elif(cmd=="size"):
        result=s.size()
        return result

    elif(cmd=="empty"):
        result=s.empty()
        return result
    
    elif(cmd=="top"):
        result=s.top()
        return result


##main

s=Stack()
N = int(input())

for i in range(N):
    command=input()
    print(stack_command(s,command))

