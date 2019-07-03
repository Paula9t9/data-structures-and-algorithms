# Lecture Notes: Quick Sort

Quick sort picks a pivot point and swaps values according to if they're larger or smaller than the pivot. It then 
repeats this process on the left and right sides of the pivot until all values are sorted.   

With this approach, we can efficiently move elements close to their final destination with minimal moves, making 
typically far more efficient than merge sort or insertion sort. 

## Learning Objectives

- Understand what the Quick Sort algorithm is.
- Understand the theory behind Quick Sort.
- Be able to implement Quick Sort in code.  


## Lecture Flow

- Draw out a visual of Quick Sort 
    - Pick a pivot point, and start swapping values. 
    - Repeat the process until all values are sorted.
- Go into more detail with pseudo code
    - How indexes are tracked.
    - Helper methods for partition and swap. 
    - Spend time explaining how recursion fits into this use case. 


## Diagram

![Quick Sort Courtesy of Wikipedia](https://en.wikipedia.org/wiki/Quicksort#/media/File:Quicksort-diagram.svg)

## Algorithm

1) Establish the right value as the pivot. 
2) Go through each value starting at the left index. If the value is less than the pivot value, set the low index to 
that value. 
3) Swap values until you reach the pivot. Then, swap the pivot and quicksort again on the left and right sights of 
the pivot.  
     

## Pseudocode

(Taken from the Codefellows assignment)

    ALGORITHM QuickSort(arr, left, right)
        if left < right
            // Partition the array by setting the position of the pivot value 
            DEFINE position <-- Partition(arr, left, right)
            // Sort the left
            QuickSort(arr, left, position - 1)
            // Sort the right
            QuickSort(arr, position + 1, right)
    
    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left - 1
        for i <- left to right do
            if arr[i] <= pivot
                low++
                Swap(arr, i, low)
    
         // place the value of the pivot location in the middle.
         // all numbers smaller than the pivot are on the left, larger on the right. 
         Swap(arr, right, low + 1)
        // return the pivot index point
         return low + 1
    
    ALGORITHM Swap(arr, i, low)
        DEFINE temp;
        temp <-- arr[i]
        arr[i] <-- arr[low]

## Readings and References

Read [this intro to Quick Sort.](https://medium.com/basecs/pivoting-to-understand-quicksort-part-1-75178dfb9313)

If you are a more visual learner, you can watch [this video from Hackr Rank](https://www.youtube.com/watch?v=SLauY6PpjW4) Bear in mind, this video uses a random pivot, whereas our pseudo code uses a right pivot. 



 