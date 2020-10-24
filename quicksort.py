def quickSort(array, left, right):
    if left >= right:
        return
    pivot = array[(left+right)//2]
    index = partition(array, left, right, pivot)
    quickSort(array, left, index-1)
    quickSort(array, index, right)


def partition(array, left, right, pivot):
    while (left <= right):
        while (array[left] < pivot):
            left += 1
        while (array[right] > pivot):
            right -= 1
        if left <= right:
            array[left], array[right] = array[right], array[left]
            left += 1
            right -= 1

    return left


arr = [9,2,6,4,3,5,1]
quickSort(arr,0,len(arr)-1)
print(arr)
