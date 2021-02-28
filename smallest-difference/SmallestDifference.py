def smallestDifference(arrayOne, arrayTwo):
    arrayOne.sort()
    arrayTwo.sort()
    indice1, indice2 = 0 , 0
    small, current = float("inf"), float("inf")
    result = []
    while indice1 < len(arrayOne) and indice2 < len(arrayTwo):
        num1 = arrayOne[indice1]
        num2 = arrayTwo[indice2]
        if num1 < num2:
            current = num2 - num1
            indice1 = indice1 + 1
        elif num2 < num1:
            current = num1 - num2
            indice2 = indice2 + 1
        else:
            return [num1, num2]
        if current < small:
            small = current
            result = [num1, num2]
    return result

array1 = [6,12,-5,4,7,11]
array2 = [5,8,-2,10,3]
print(smallestDifference(array1, array2))