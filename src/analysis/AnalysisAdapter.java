/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAScript(AScript node)
    {
        defaultCase(node);
    }

    public void caseAEntityDefinition(AEntityDefinition node)
    {
        defaultCase(node);
    }

    public void caseAFieldInnerDefinition(AFieldInnerDefinition node)
    {
        defaultCase(node);
    }

    public void caseARelationInnerDefinition(ARelationInnerDefinition node)
    {
        defaultCase(node);
    }

    public void caseAUnicityInnerDefinition(AUnicityInnerDefinition node)
    {
        defaultCase(node);
    }

    public void caseAMoreInnerDefinition(AMoreInnerDefinition node)
    {
        defaultCase(node);
    }

    public void caseAFieldDefinition(AFieldDefinition node)
    {
        defaultCase(node);
    }

    public void caseAOneRelationDefinition(AOneRelationDefinition node)
    {
        defaultCase(node);
    }

    public void caseAManyRelationDefinition(AManyRelationDefinition node)
    {
        defaultCase(node);
    }

    public void caseAUnicityDefinition(AUnicityDefinition node)
    {
        defaultCase(node);
    }

    public void caseADateDataType(ADateDataType node)
    {
        defaultCase(node);
    }

    public void caseAIntegerDataType(AIntegerDataType node)
    {
        defaultCase(node);
    }

    public void caseARealDataType(ARealDataType node)
    {
        defaultCase(node);
    }

    public void caseAStringDataType(AStringDataType node)
    {
        defaultCase(node);
    }

    public void caseAStringLength(AStringLength node)
    {
        defaultCase(node);
    }

    public void caseAMayBeZero(AMayBeZero node)
    {
        defaultCase(node);
    }

    public void caseAMoreIdentifier(AMoreIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    public void caseTEntity(TEntity node)
    {
        defaultCase(node);
    }

    public void caseTHas(THas node)
    {
        defaultCase(node);
    }

    public void caseTMany(TMany node)
    {
        defaultCase(node);
    }

    public void caseTOne(TOne node)
    {
        defaultCase(node);
    }

    public void caseTRequired(TRequired node)
    {
        defaultCase(node);
    }

    public void caseTTo(TTo node)
    {
        defaultCase(node);
    }

    public void caseTUnique(TUnique node)
    {
        defaultCase(node);
    }

    public void caseTZero(TZero node)
    {
        defaultCase(node);
    }

    public void caseTDate(TDate node)
    {
        defaultCase(node);
    }

    public void caseTInteger(TInteger node)
    {
        defaultCase(node);
    }

    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}