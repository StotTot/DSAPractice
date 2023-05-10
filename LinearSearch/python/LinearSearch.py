arr = [1, 2, 3, 9, 4, 5]
target = 9
for i in range(len(arr)):
    if arr[i] == target:
        print("Target found at index " + str(i))
        break