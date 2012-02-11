/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AUnicityInnerDefinition extends PInnerDefinition
{
    private PUnicityDefinition _unicityDefinition_;

    public AUnicityInnerDefinition()
    {
        // Constructor
    }

    public AUnicityInnerDefinition(
        @SuppressWarnings("hiding") PUnicityDefinition _unicityDefinition_)
    {
        // Constructor
        setUnicityDefinition(_unicityDefinition_);

    }

    @Override
    public Object clone()
    {
        return new AUnicityInnerDefinition(
            cloneNode(this._unicityDefinition_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnicityInnerDefinition(this);
    }

    public PUnicityDefinition getUnicityDefinition()
    {
        return this._unicityDefinition_;
    }

    public void setUnicityDefinition(PUnicityDefinition node)
    {
        if(this._unicityDefinition_ != null)
        {
            this._unicityDefinition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unicityDefinition_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unicityDefinition_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unicityDefinition_ == child)
        {
            this._unicityDefinition_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unicityDefinition_ == oldChild)
        {
            setUnicityDefinition((PUnicityDefinition) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}