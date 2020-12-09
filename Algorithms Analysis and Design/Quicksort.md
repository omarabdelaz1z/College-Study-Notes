# Quicksort

## *Properties*

- DC Algorithm
- Sorts elements in-place
- Very practical algorithm (with tuning!)

## *Algorithm*

1. Partition the array into two subarrays around pivot.
2. lower subarray elements <= pivot <= upper subarray elements.

3. Recursively sort the 2 subarrays.
4. Combine.

## *Visualization*

![](screenshots\quicksort.png)

## *Analysis*

:arrow_forward: Worst-case Time

- Array is already sorted or reverse sorted.

- One side of partition has no elements.

- Therefore, T(n) = T(0) + T(n-1) + Θ(n)

  T(n) = T(n-1) + Θ(n) 

  T(n) = Θ(n^2) (arithmetic series)

  ![image-20201209154605290](screenshots\qs_worst_case.png) 

:arrow_forward: Best-case Time (lucky)

- Partition splits the array evenly:

- T(n) = 2T(n/2) + Θ(n)

  T(n) = Θ(n * log(n))

- ![image-20201209160207296](screenshots\lucky.png)

## *Implementation*

```cpp
template <typename T>
int partitionArray(T Array[], int low,int high) {
	int pi = low;
    T pivot = Array[high];

	//pivot value is inserted at correct position
	//  where elements < pivot are on the left
	//  and elements > pivot are on the right;

	int pivotIndex = high; // sizearray - 1;
    // from 0 to n
	for (int i = low; i < pivotIndex; i++) {
		if (Array[i] <= pivot) {
			swap(Array[i], Array[pi++]);
		}
	}
	swap(Array[pi], Array[high]);

    return pi; // return the proper location of pivot.
}

template <typename T>
void quickSort(T Array[], int low, int high) {
	if (low < high) {
		int newPivotIndex = partitionArray(Array, low, high);
        // partitioning subroutine takes linear time. O(N)

		quickSort(Array, low, newPivotIndex - 1); 
        // recursively sort left-side of the array

		// a[m] = pivot is already sorted after partition
		quickSort(Array, newPivotIndex + 1, high);
        // then sort right-side of the array
	}
}
// initial call: 
quickSort<char>(Array, 0, sizearray-1);
```

# Randomized Quicksort

## *Algorithm*

- Partition around a random element(we choose random number k between low and high)

- Note: Running time is independent of input ordering

## *Analysis*



## *Implementation*

```cpp
template <typename T>
int partitionArray(T Array[], int low,int high) {
	int pi = low;
    T pivot = Array[high];

	//pivot value is inserted at correct position
	//  where elements < pivot are on the left
	//  and elements > pivot are on the right;

	int pivotIndex = high; // sizearray - 1;
    // from 0 to n
	for (int i = low; i < pivotIndex; i++) {
		if (Array[i] <= pivot) {
			swap(Array[i], Array[pi++]);
		}
	}
	swap(Array[pi], Array[high]);

    return pi; // return the proper location of pivot.
}

template <typename T>
int partition_r(T Array[], int low, int high)
{
    // Generate a random number in between
    // low .. high
    srand(time(NULL));
    int random = low + rand() % (high - low);
 
    // Swap A[random] with A[high]
    swap(Array[random], Array[high]);
 
    return partition(Array, low, high);
}
template <typename T>
void quickSort(T Array[], int low, int high) {
	if (low < high) {
		int newPivotIndex = partition_r(Array, low, high);
        // partitioning subroutine takes linear time. O(N)

		quickSort(Array, low, newPivotIndex - 1); 
        // recursively sort left-side of the array

		// a[m] = pivot is already sorted after partition
		quickSort(Array, newPivotIndex + 1, high);
        // then sort right-side of the array
	}
}
// initial call: 
quickSort<char>(Array, 0, sizearray-1);
```

