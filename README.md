# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Memento Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي object و عايز كل ما اغير فيه احفظ منه نسخه منه عشان يكون عندي history لل object ده بعد كل تغيير حصل فيه و اقدر اعمل undo للتغير في اي وقت .. عشان كده بعمل object اسمه care taker و ده للي بييهتم بال object و يحفظ كل ال snapshots بتاعته
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال entities:
  - ال Employee Class
  - ال package بتاعت ال caretaker:
    - ال EmployeeCareTaker و ده فيه ال handling بتاع ال snapshots لل Employee Class
