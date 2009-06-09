package fi.hut.soberit.agilefant.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name = "history_iterations")
public class IterationHistoryEntry {

    private int id;

    private Iteration iteration;

    private long effortLeftSum;

    private long originalEstimateSum;

    private long deltaEffortLeft;

    private long deltaOriginalEstimate;

    private DateTime timestamp;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(optional = false)
    public Iteration getIteration() {
        return iteration;
    }

    public void setIteration(Iteration iteration) {
        this.iteration = iteration;
    }

    public long getEffortLeftSum() {
        return effortLeftSum;
    }

    public void setEffortLeftSum(long effortLeftSum) {
        this.effortLeftSum = effortLeftSum;
    }

    public long getOriginalEstimateSum() {
        return originalEstimateSum;
    }

    public void setOriginalEstimateSum(long originalEstimateSum) {
        this.originalEstimateSum = originalEstimateSum;
    }

    public long getDeltaEffortLeft() {
        return deltaEffortLeft;
    }

    public void setDeltaEffortLeft(long deltaEffortLeft) {
        this.deltaEffortLeft = deltaEffortLeft;
    }

    public long getDeltaOriginalEstimate() {
        return deltaOriginalEstimate;
    }

    public void setDeltaOriginalEstimate(long deltaOriginalEstimate) {
        this.deltaOriginalEstimate = deltaOriginalEstimate;
    }

    @Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
    public DateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
    }

}