# Lab4-Repository

### Question 1

Blocking a thread means freezing the execution of that thread either because
(a) the thread is sleeping/waiting on some kind of I/O or (b) the thread is 
executing something (and thus cannot run whatever it is you want it to run).
The UI thread is the thread that is responsible for actually making the changes
to the UI our app tells Android to make. If you block the UI thread, the UI will
not change because the UI thread is busy doing something else instead of making
the UI updates you told it to. The app wil appear unresponsive to the user.

### Question 2

TextView#setText(String)
TextView#setVisibility(int)
