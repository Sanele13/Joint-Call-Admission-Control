/*
Name: Sanele Mpangalala
Joint Call Admission Control
*/

import java.util.*;
import java.io.*;

public class state{
   int m_11;
   int n_11;
   
   int m_12;
   int n_12;
   
   int m_22;
   int n_22;
   
   public state(int m_11, int n_11, int m_12, int n_12, int m_22, int n_22){
      this.m_11 =m_11;
      this.n_11 = m_11;
      this.m_12 = m_12;
      this.n_12 = n_12;
      this.m_22 = m_22;
      this.n_22 = n_22;
   }

}