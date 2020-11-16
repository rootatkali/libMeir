package basics;

public class Vecs {
  private final int dim;
  
  private final double[] xyz;
  
  public Vecs() {
    this.dim = 2;
    this.xyz = new double[this.dim + 1];
  }
  
  public Vecs(int dim) {
    this.dim = dim;
    this.xyz = new double[this.dim + 1];
    this.xyz[0] = -1.0D;
  }
  
  public int getDim() {
    return this.dim;
  }
  
  public void setValue(double value, int dimention) {
    if (dimention > 0 && dimention <= this.dim)
      this.xyz[dimention] = value;
  }
  
  public double getValue(int dimention) {
    if (dimention > 0 && dimention <= this.dim)
      return this.xyz[dimention];
    return -1.0D;
  }
  
  public Vecs addVec(Vecs v2) {
    Vecs res = new Vecs(this.dim);
    for (int ii = 1; ii <= this.dim; ii++)
      res.xyz[ii] = this.xyz[ii] + v2.getValue(ii);
    return res;
  }
  
  public Vecs mullC(double coeff) {
    Vecs res = new Vecs(this.dim);
    for (int ii = 1; ii <= this.dim; ii++)
      res.xyz[ii] = this.xyz[ii] * coeff;
    return res;
  }
  
  public Vecs subtVec(Vecs v2) {
    Vecs res = new Vecs(this.dim);
    res = v2.mullC(-1.0D);
    res = addVec(res);
    return res;
  }
  
  public double mullVec(Vecs v2) {
    double res = 0.0D;
    for (int ii = 1; ii <= this.dim; ii++)
      res += this.xyz[ii] * v2.getValue(ii);
    return res;
  }
  
  public double distance(Vecs other) {
    double ret = 0.0D;
    for (int i = 1; i < this.xyz.length; i++)
      ret += Math.pow(this.xyz[i] - other.getValue(i), 2.0D);
    return Math.sqrt(ret);
  }
  
  public String toString() {
    String s = "dimention =" + this.dim + "  ";
    for (int ii = 1; ii <= this.dim; ii++)
      s = s + this.xyz[ii] + " ";
    return s;
  }
}
