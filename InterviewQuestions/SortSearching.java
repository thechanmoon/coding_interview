// package InterviewQuestions;

public class SortSearching {
    // 10.1 Sorted Merge: You are given two sorted arrays, A and B, where A has a
    // large enough buffer at the
    // end to hold B. Write a method to merge B into A in sorted order.

    // javascript
    // function sortedMerge(a, b) {
    // let aIndex = a.length - 1;
    // let bIndex = b.length - 1;
    // for (let j = bIndex; j> -1; j--) {
    // for (let i = aIndex; i > -1; i--) {
    // if(a[i] >= b[j])
    // {
    // if(i !== 0 && a[i-1] <= b[j])
    // {
    // a.splice(i, 0, b[j]);
    // break;
    // }else if (i === 0)
    // {
    // a.splice(i, 0, b[j]);
    // break;
    // }
    // }else if(a[i] < b[j])
    // {
    // a.splice(i+1, 0, b[j]);
    // break;
    // }
    // }
    // }
    // return a;
    // }

    // const a = [3, 5, 6, 8, 11, 12, 13];
    // const b = [2, 4, 6, 12, 18, 19];
    // console.log(sortedMerge(a, b));

    // const a = [2, 3, 4, 5, 6, 8, 10, 100];
    // const b = [1, 4, 7, 6, 7, 7];
    // console.log(sortedMerge(a, b));

    // const a = [0,2,4];
    // const b = [1,3,5];
    // console.log(sortedMerge(a, b));

    // const a = [0,1,2];
    // const b = [3,4,5];
    // console.log(sortedMerge(a, b));

    // const a = [0,1,2];
    // const b = [];
    // console.log(sortedMerge(a, b));

    public static int[] sortedMerge(int[] a, int[] b) {
        return a;
    }

    public static void main(final String[] args) {
        System.out.println("Test");
    }
}
