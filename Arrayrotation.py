def rotate(a, b, n):
    k = a.index(b)
    new_lis = []
    new_lis = a[k+1:]+a[0:k+1]
    return new_lis
 
 
if __name__ == '__main__':
    arr = [1, 2, 3, 4, 5, 6, 7]
    b = 4
    N = len(arr)
 
    arr = rotate(arr, b, N)
    for i in arr:
        print(i, end=" ")
