//Штоппель Кирилл. Практика в четверг, 8:55 - 9:45
///////////////////////////////////////////////////////////////
/// Документы
abstract class Document {
    public abstract void Open();
}

class Letter extends Document {
    public void Open() {
        System.out.println("Letter open");
    }
}
class Report extends Document {
    public void Open() {
        System.out.println("Report open");
    }
}
class Resume extends Document {
    public void Open() {
        System.out.println("Resume open");
    }
}
class Check extends Document {
    public void Open() {
        System.out.println("Check open");
    }
}
///////////////////////////////////////////////////////////////
/// Создание документов
abstract class DocumentCreator {
    public abstract Document CreateDocument();
}

class LetterCreator extends DocumentCreator {
    public Document CreateDocument() {
        return new Letter();
    }
}
class ReportCreator extends DocumentCreator {
    public Document CreateDocument() {
        return new Report();
    }
}
class ResumeCreator extends DocumentCreator {
    public Document CreateDocument() {
        return new Resume();
    }
}
class CheckCreator extends DocumentCreator {
    public Document CreateDocument() {
        return new Check();
    }
}