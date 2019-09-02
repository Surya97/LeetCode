# return an array consisting of all the even elements of A, followed by all the odd elements of A.


def sort_array_by_parity(A):
    n = len(A)
    i, j = 0, n - 1
    while i < j:
        if A[i] % 2 == 1 and A[j] % 2 == 0:
            A[i], A[j] = A[j], A[i]

        i, j = i + 1 - A[i] % 2, j - A[j] % 2

    return A
