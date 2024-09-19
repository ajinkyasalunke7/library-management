
package LibraryManagement;

/**
 *
 * @author ajink
 */
public class IssueComboItem {
    private String display;
    private int issueId;

    public IssueComboItem(String display) {
        this.display = display;
        this.issueId = issueId;
    }

    @Override
    public String toString() {
        return display; // What's displayed in the combo box
    }

    public int getIssueId() {
        return issueId;
    }
}
