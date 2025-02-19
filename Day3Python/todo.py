todo=[]
def add_todo():
    task=input("enter your task")
    todo.append(task)
    print(add_todo)
def remove_todo():
    task=input("enter the task to remove")
    todo.pop()
    print("removed task")
def get_all_todo():
    print("todo details",todo)
while True:
    entery=input("enter 1 for todo 2 for remove todo and 3 for getall 4 to exit ")
    if entery=='1':
        add_todo()
    elif entery=='2':
        remove_todo()
    elif entery=='3':
        get_all_todo()
    else:
        print("exit")