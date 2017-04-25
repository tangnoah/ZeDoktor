# HelpDesk
## ZeDoktor
Herman Lin, Noah Tang, Jesse Sit
APCS pd3
### Design
For ArrayPriorityQueue, we decided to enqueue to the left of the array and dequeue from the right of the array. By doing so, it would allow dequeue-ing to be a lot simpler as it would have a runtime of O(1).  This also means that when enqueue-ing, we check the priorities and insert the Ticket accordingly.

In order to enqueue the Tickets into their correct places by priority, we implemented Comparable into the TIcket class. This allowed us to overwrite the compareTo method so that it would compare the priorities of two Tickets.

For HelpDesk, we designed it according to the flowchart we created in class where one would go up to the help desk and create a ticket, diagnose the problem, and solve the problem.