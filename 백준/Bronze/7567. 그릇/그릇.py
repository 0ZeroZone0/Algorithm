shape = input()

length = 10

for i in range(1, len(shape)):
  if shape[i] == shape[i-1]:
    length += 5
  else:
    length += 10

print(length)