number = int(input())
d = 2

while number != 1:
  if number % d != 0:
    d += 1
  else:
    number //= d
    print(d)
