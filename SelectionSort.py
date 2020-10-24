#선택 정렬
#시간 복잡도는 n * n - 1 = n^2 - n 이므로 O(n^2)이다.
#알고리즘은 배열의 맨 처음부터 시작하여 인덱스를 선택하고 그 선택한 인덱스 이후의
#배열에서 가장 최소값을 찾은 뒤 선택한 인덱스와 교환한다. 

def selectionsort(array):
    n = len(array)
    for i in range(n-1):
        minNum = 987654321
        minIdx = 0
        for j in range(i+1, n):
            if array[j] < minNum:
                minNum = array[j]
                minIdx = j
        print(array)
        if minNum < array[i]:
            array[i], array[minIdx] = array[minIdx], array[i]
        print(array)
    

if __name__ == "__main__":
    array = [9, 2, 6, 4, 3, 5, 1]
    selectionsort(array)
    print(array)
        
