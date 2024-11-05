import calendar

def is_leap(year_number):
    # Write your logic here
    return calendar.isleap(year_number)

year = int(input())
print(is_leap(year))
