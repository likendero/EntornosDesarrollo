/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageA;

/**
 *
 * @author likendero
 */
public class SubClass {
    
    private ClassA.SubClass delegate;

    public SubClass(ClassA.SubClass delegate) {
        this.delegate = delegate;
    }

    public SubClass() {
        this.delegate = new ClassA.SubClass();
    }

    public static final SubClass[] wrap(ClassA.SubClass... subClasss) {
        return Arrays.stream(subClasss).map((SubClass t) -> new packageA.SubClass(t)).toArray(packageA.SubClass[]::new);
    }

    public void subMethod() {
        delegate.subMethod();
    }

    public boolean equals(Object o) {
        Object target = o;
        if (o instanceof SubClass) {
            target = ((SubClass) o).delegate;
        }
        return this.delegate.equals(target);
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }
    
}
