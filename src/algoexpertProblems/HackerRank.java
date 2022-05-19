package algoexpertProblems;


import java.util.Arrays;

public class HackerRank {
    /*
    Reductor Array For two integer arrays, the comparator value is the
    total number of elements in the first array such that there exists
    no integer in the second array with an absolute difference less than
    or equal to d. Find the comparator value. For example there are two
    arrays a = [ 7,5, 9), b = 1 13, 1, 4), and the integer d = 3. The
    absolute difference of a[0] to b[0] = 17 - 13/= 6, b[1= 17-1 | = 6,
    and b[2] = 17-41= 3, to recap, the values are 6,6, 3. In this case,
    the absolute difference with b[2] is equal to d = 3, so this element
    does not meet the criterion. A similar analysis of a[1] = 5 yields
    absolute differences of 8, 4, 1 and of a[2] 9 yields 4, 8, 5. The only
    element of a that has an absolute difference with each element of b that
    is always greater than this element a[2], thus the comparator value is 1.
    Function Description Complete the function comparatorValue in the editor
    below. The function must return an integer that denotes the comparator
    value of the arrays. comparatorValue has the following parameter(s):
    a[a[O),...a/n - 1]]: an array of integers b[b[0],...b[m - 1]]: an array of
    integers d: an integer
     */
    public static int reductorArray(int[] a, int [] b, int d){
        /*
        Traverse the arrays starting from A, then go to b
        Create an array of length b
        Subtract an element of A from every element in B,
        The gotten value into the newly created array
        if along the way, you encounter a difference that is lesser or equal to d,
            then move to the next element of A
        If you traverse B without been cut short, increase a previously declared counter
            by 1
        return counter
         */
        int counter =0;
        Arrays.sort(a);
        Arrays.sort(b);
        int smallestDifference = 0;

        for (int value : a) {
            int firstIndex = b[0];
            int lastIndex = b[b.length - 1];
            int firstDifference = Math.abs(firstIndex - value);
            int lastDifference = Math.abs(lastIndex - value);
            System.out.println(firstDifference);
            System.out.println(lastDifference);
            if ( firstDifference > d && lastDifference > d ) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int [] arr1 = {3, 9, 22, 1, 4};
        int[] arr2 = {5, 22, 3, 2};
        int k = 1;
        System.out.println(reductorArray(arr1, arr2, k));
    }
}
































//    For two integer arrays, the comparator value is the total number of elements in the first array such that there exists no integer in the second array with an absolute difference less than or equal to d. Find the comparator value.
//
//
//
//        For example there are two arrays a = [ 7, 5, 9], b = [ 13, 1, 4 ], and the integer d = 3.  The absolute difference of a[0] to b[0] = | 7 - 13 | = 6, b[1] = | 7 - 1 | = 6, and b[2] = | 7 - 4 | = 3, to recap, the values are 6, 6, 3. In this case, the absolute difference with b[2] is equal to d = 3, so this element does not meet the criterion. A similar analysis of a[1] = 5 yields absolute differences of 8, 4, 1 and of a[2] = 9 yields 4, 8, 5.  The only element of a that has an absolute difference with each element of b that is always greater than d is element a[2], thus the comparator value is 1.
//
//
//
//        Function Description
//
//        Complete the function comparatorValue in the editor below. The function must return an integer that denotes the comparator value of the arrays.
//
//
//
//        comparatorValue has the following parameter(s):
//
//        a[a[0],...a[n − 1]]: an array of integers
//
//        b[b[0],...b[m − 1]]: an array of integers
//
//        d: an integer
//
//
//
//        Constraints
//
//        1 ≤ n, m ≤ 105
//        0 ≤ a[i], b[j], d ≤ 108
//
//
//        Input Format For Custom Testing
//        Sample Case 0
//        Sample Input For Custom Testing
//
//        3
//        3
//        1
//        5
//        3
//        5
//        6
//        7
//        2
//        Sample Output
//
//        1
//        Explanation
//
//        The first array a = [3, 1, 5], the second array b = [5, 6, 7], and d = 2. Now find the absolute difference of each element of the first array with the elements of the second array:
//
//        For a[0] = 3, the differences are a[0] − b[0] = 3 − 5 = −2, a[0] − b[1] = 3 − 6 = −3, and a[0] − b[2] = 3 − 7 = −4. Therefore, the absolute differences are [2, 3, 4]. For a[0] = 3, there exists at least one integer in the second array with absolute difference less than or equal to d = 2.
//        For a[1] = 1, the differences are a[1] − b[0] = 1 − 5 = −4, a[1] − b[1] = 1 − 6 = −5, and a[1] − b[2] = 1 − 7 = −6. Therefore, the absolute differences are [4, 5, 6]. For a[1] = 1, there exists no integer in the second array with absolute difference less than or equal to d = 2.
//        For a[2] = 5, the differences are a[2] − b[0] = 5 − 5 = 0, a[2] − b[1] = 5 − 6 = −1, and a[2] − b[2] = 5 − 7 = −2. Therefore, the absolute differences are [0, 1, 2]. For a[2] = 5, there exists at least one integer in the second array with absolute difference less than or equal to d = 2.
//        The comparator value is 1.


//    A purchasing manager must buy a specific number of units of an item to replenish the warehouse. The primary supplier has a list of containers, each with a number of units. The manager must buy contiguous containers, starting at container 0 and continuing until at least the desired number has been purchased. If there are not enough units available, they must be purchased from another supplier. If any excess items must be purchased, they must be resold. Determine the remaining number of items to be purchased or sold after purchasing from the primary supplier.
//
//
//
//        Example
//
//        n=5
//
//        itemCount = [10, 20, 30, 40, 15]
//
//        target = 80
//
//
//
//        The manager starts buying at index 0 and continues until all available units are purchased or until at least 80 units have been purchased. The manager will buy containers with itemCounts = 10 + 20 + 30 + 40 = 100. Since too many items were purchased, the number sold is purchased - target = 100 - 80 = 20 units.
//
//
//
//        If the target = 130, the manager will purchase all of the units from the primary supplier for a total of purchases = 115.  Then another target - purchases = 130 - 115 = 15 additional units must be purchased.
//
//
//
//        Function Description
//
//
//
//        Complete the function restock in the editor below.
//
//
//
//        restock has the following parameter(s):
//
//        int itemCount[n]:  an array of integers that denote the item counts of the each container in the order they must be purchased
//
//        int : target: an integer that denotes the target number of items needed
//
//        Returns:
//
//        int:  number of units that must be resold or that must be purchased from an alternate supplier.
//
//
//
//        Constraints
//
//        1 ≤ n ≤ 105
//        1 ≤ target ≤ 109
//        1 ≤ itemCount[i] ≤ 109
//
//
//        Input Format For Custom Testing
//        Sample Case 0
//        Sample Input For Custom Testing
//
//        STDIN     Function
//        -----     --------
//        4       → itemCount[] size n = 4
//        6       → itemCount[] = [6, 1, 2, 1]
//        1
//        2
//        1
//        100     → target = 100
//        Sample Output
//
//        90
//        Explanation
//
//
//        The number of items available at the primary supplier is 6 + 1 + 2 + 1 = 10 units. The manager should buy 100 - 10 = 90 additional units.
//
//        Sample Case 1
//        Sample Input For Custom Testing
//
//        STDIN     Function
//        -----     --------
//        5       → itemCount[] size n = 5
//        1       → itemCount[] = [1, 2, 3, 2, 1]
//        2
//        3
//        2
//        1
//        4       → target = 4
//        Sample Output
//
//        2
//        Explanation
//
//        The number of items in the first 3 containers is 1 + 2 + 3 = 6. The purchasing manager should sell 6-4 = 2 units

//    Given a number of nodes and a list of connected pairs, determine the weights of each isolated set of nodes assuming each node weighs 1 unit. Then for each weight calculated, sum the ceiling of its square root and return the final sum.
//
//
//
//        Example
//
//        graph_nodes = 10
//
//        graph_from = [1, 1, 2, 3, 7]
//
//        graph_to = [2, 3, 4, 5, 8]
//
//
//
//
//
//
//
//        There are graph_edges = 5 edges to consider. There are 2 isolated sets with more than one node, {1, 2, 3, 4, 5} and {7, 8}.  The ceilings of their square roots are 51/2 ≅ 2.236 and ceil(2.236) = 3, 21/2 ≅ 1.414 and ceil(1.414) = 2.  The other three isolated nodes are separate and the square root of their weights is 11/2 = 1 respectively.   The sum is 3 + 2 + (3 * 1) = 8.
//
//
//
//        Function Description
//
//        Complete the function connectedSum in the editor below.
//
//
//
//        connectedSum has the following parameter(s):
//
//        int graph_nodes: the number of nodes
//
//        int graph_from[graph_edges]:  an array of integers that represent one end of an edge
//
//        int graph_to[graph_edges]:  an array of integers that represent the other end of an edge
//
//
//
//        Returns:
//
//        int: an integer that denotes the sum of the values calculated
//
//
//
//        Constraints
//
//        2 ≤ graph_nodes ≤ 105
//        1 ≤ graph_edges ≤ 105
//        1 ≤ graph_from[i], graph_to[i] ≤ n
//        graph_from[i] ≠ graph_to[i]
//
//
//        Input Format for Custom Testing
//        Sample Case 0
//        Sample Input 0
//
//        STDIN      Function
//        -----      ---------
//        4 2   →    graph_nodes = 4 nodes, graph_edges = 2 edges
//        1 2   →    graph_from[] = [1, 1], graph_to[] = [2, 4]
//        1 4
//        Sample Output 0
//
//        3
//
//
//        Explanation 0
//
//
//
//        The diagram below shows the groups of nodes:
//
//
//
//
//
//        The values to sum are:
//
//        Set {1, 2, 4}: c = ceil(sqrt(3)) = 2
//        Set {3}: c = ceil(sqrt(1)) = 1
//
//
//        2 + 1 = 3
//Sample Input 1
//
//        STDIN      Function
//        -----      ---------
//        8 4   →    graph_nodes = 8 nodes, graph_edges = 4 edges
//        8 1   →    graph_from[] = [8, 5, 7, 8], graph_to[] = [1, 8, 3, 6]
//        5 8
//        7 3
//        8 6
//
//
//        Sample Output 1
//
//        6
//
//
//        Explanation 1
//
//
//
//        The diagram below shows the groups of nodes:
//
//
//
//
//
//        The values to sum for each group are:
//
//        Set {2}: c = ceil(sqrt(1)) = 1
//        Set {4}: c = ceil(sqrt(1)) = 1
//        Set {1, 5, 6, 8}: c = ceil(sqrt(4)) = 2
//        Set {3, 7}: c = ceil(sqrt(2)) = 2
//
//
//        1 + 1 + 2 + 2 = 6

//7. Medical Records By Age
//        Use the HTTP GET method to retrieve information from a database of patient medical records. Query https://jsonmock.hackerrank.com/api/medical_records to find all the records. The query result is paginated and can be further accessed by appending to the query string ?&page=num where num is the page number.
//
//
//
//        The query response from the API is a JSON with the following five fields:
//
//
//
//        page: the current page
//        per_page: the maximum number of results per page
//        total: the total number of records in the search result
//        total_pages: the total number of pages which must be queried to get all the results
//        data: an array of JSON objects that contain medical records
//
//
//        The data field in the response contains a list of medical records with the following schema:
//
//
//
//        id: The unique ID of the record
//timestamp: the timestamp when the record was generated (In UTC as milliseconds)
//        userId: the id of the user for whom the transaction has been recorded
//        userName : the name of the patient/user for whom the transaction has been recorded
//        userDob: the date of birth of user in format DD-MM-YYYY
//        vitals: object, the vitals of the user
//        vitals.bloodPressureDiastole: the diastolic pressure reading of the user, mmHg
//        vitals.bloodPressureSystole: the systolic pressure reading of the user, mmHg
//        vitals.pulse: the pulse rate of the user, beats per minute
//        vitals.breathingRate: The breathing rate of the user, breaths per minute
//        vitals.bodyTemperature: The body temperature of the user, degrees Fahrenheit
//        diagnosis: object, the diagnosis for the user
//        diagnosis.id: the id of the diagnosis
//        diagnosis.name: the name of the condition diagnosed
//        diagnosis.severity: the severity of the condition diagnosed
//        doctor: object, the doctor who diagnosed the condition
//        doctor.id: the id of the doctor who diagnosed the condition
//        doctor.name: the name of the doctor who diagnosed the condition
//        meta: object, the meta information of the user
//        meta.height: the current height of the user, centimeters
//        meta.weight: the current weight of the user, pounds
//
//
//        Fetch all medical records and filter based on the following criteria:
//
//        ageStart ≤ the age of the user at the time of the record creation timestamp ≤ ageEnd
//        For the users matching the first criteria, bloodPressureDiastole - bloodPressureSystole > bpDiff
//
//
//        Function Description
//
//        Complete the function getRecordsByAgeGroup in the editor below.
//
//
//
//
//        getRecordsByAgeGroup has the following parameter(s):
//
//        int ageStart: the minimum age requirement (inclusive)
//
//        int ageEnd: the maximum age requirement (inclusive)
//
//        int bpDiff: the difference in systolic and diastolic pressures must be less than this value
//
//        Returns:
//
//        int[]: a sorted array of ids of the records matching the above criteria. If no records are matched, return [-1]
//
//
//
//        Constraints:
//
//        0 ≤ ageStart, ageEnd, bpDiff ≤ 102
//        Input Format For Custom Testing
//        Sample Case 0
//        Sample Input For Custom Testing
//
//        STDIN    Function
//        -----    --------
//        28    →  ageStart = 28
//        30    →  ageEnd = 30
//        63    →  bpDiff = 63
//        Sample Output
//
//        31
//
//
//        The query https://jsonmock.hackerrank.com/api/medical_records will return the response:
//
//
//
//        [
//        { id: 31,
//        timestamp: 1555004832077,
//        diagnosis: { id: 3, name: 'Pulmonary embolism', severity: 4 },
//        vitals:
//        { bloodPressureDiastole: 154,
//        bloodPressureSystole: 90,
//        pulse: 138,
//        breathingRate: 26,
//        bodyTemperature: 102.9 },
//        doctor: { id: 3, name: 'Dr Pilar Cristancho' },
//        userId: 2,
//        userName: 'Bob Martin',
//        userDob: '14-09-1989',
//        meta: { height: 174, weight: 178 },
//        age: 29 }...
//        ]
//
//
//
//        The query will return all the records in medical_history. Now calculate the age of the user in the fetched record at the time at which record was created and then check whether the age lies between the range of ageStart and ageEnd. Check if the bpDiff is less than the difference between the bloodPressureDiastole and bloodPressureSystole. If matched, return an array containing the ids of the matched records.
//
//
//
//        An analysis of the record with id = 31 follows. The sample input provided is ageStart = 28, ageEnd=30 and bpDiff = 63.  For the record with id = 31, the age of the user at the time of record creation is 29 years which is in the age range. The difference between bloodPressureDiastole = 154 and bloodPressureSystole = 90  is 64 which is greater than bpDiff = 63.