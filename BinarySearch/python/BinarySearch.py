arr = [1, 2, 3, 4, 5]
target = 5
tail = 0
head = len(arr) - 1
mid = int((tail + head) / 2)

while (tail <= head):
    if arr[mid] < target:
        tail = mid + 1
        mid = int((tail + head) / 2)
    elif arr[mid] > target:
        head = mid - 1
        mid = int((tail + head) / 2)
    elif arr[mid] == target:
        print("Index found at " + str(mid))
        break