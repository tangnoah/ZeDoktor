# HelpDesk
## ZeDoktor
Herman Lin, Noah Tang, Jesse Sit
APCS pd3
### Design
For ArrayPriorityQueue, we decided to enqueue to the left of the array and dequeue from the right of the array. By doing so, it would allow dequeue-ing to be a lot simpler as it would have a runtime of O(1).  This also means that when enqueue-ing, we check the priorities and insert the Ticket accordingly.

For HelpDesk, we chose to create a menu that the user would interact with through the CLI. The choices include checking for a Ticket ID and creating a new ticket. We decided that the menu and its selections should be run through a while loop so that we are able to maintain multiple Tickets in the queue.