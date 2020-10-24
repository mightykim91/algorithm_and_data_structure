def mergesort(array, temp, left, right):
    if left < right:
        mid = (left + right) // 2
        mergesort(array, temp, left, mid)
        mergesort(array, temp, mid+1, right)
        merge(array, temp, left, right)

def merge(array, temp, left, right):
    leftStart = left
    leftEnd = (left + right) // 2
    rightStart = leftEnd + 1
    index = left
    print("left{} leftEnd{} right{} rightEnd{}".format(leftStart, leftEnd, rightStart, right))
    while(leftStart <= leftEnd and rightStart <= right):
        if array[leftStart] <= array[rightStart]:
            temp[index] = array[leftStart]
            leftStart += 1
        else:
            temp[index] = array[rightStart]
            rightStart += 1
        index += 1
    
    for i in range(leftStart, leftEnd+1):
        temp[index] = array[i]
        index += 1
    for i in range(rightStart, right+1):
        temp[index] = array[i]
        index += 1
    
    for i in range(left, right+1):
        array[i] = temp[i]
        print(temp[i], array[i])
    
    
if __name__ == "__main__":
    arr = [9, 2, 6, 4, 3, 5, 1]
    temp = [0]*len(arr)
    mergesort(arr, temp, 0, len(arr)-1)
    print(arr)
