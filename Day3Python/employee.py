employee={
    "A": 50000,
    "B": 60000,
    "C": 70000
}
def new_employee(name,salary):
    employee[name]=salary
    print("Added employee {name} with {salary}")
def update_salary(name,salary):
    if name in employee:
        employee[name]=salary
        print("updated employee {name} with {salary}")
    else:
        ("person not in data or list")
def remove_employee(name,salary):
    if name in employee:
        del employee[name]
        print("employee removed out of list")
    else:
        print("person not in data or list")
