package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;


public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    @Override
    public String toString() {
        return message;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WorkRequest other = (WorkRequest) obj;
        if ((this.message == null) ? (other.message != null) : !this.message.equals(other.message)) {
            return false;
        }
        if ((this.status == null) ? (other.status != null) : !this.status.equals(other.status)) {
            return false;
        }
        if (this.sender != other.sender && (this.sender == null || !this.sender.equals(other.sender))) {
            return false;
        }
        if (this.receiver != other.receiver && (this.receiver == null || !this.receiver.equals(other.receiver))) {
            return false;
        }
        if (this.requestDate != other.requestDate && (this.requestDate == null || !this.requestDate.equals(other.requestDate))) {
            return false;
        }
        if (this.resolveDate != other.resolveDate && (this.resolveDate == null || !this.resolveDate.equals(other.resolveDate))) {
            return false;
        }
        return true;
    }
    
    
}
