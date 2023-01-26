package frc.robot;

public class PneumaticsShifterTestAutonomousDecisionMaker {

  private PneumaticsCompressor m_PneumaticsCompressor;
  private ShifterControl m_ShifterControl;


  PneumaticsShifterTestAutonomousDecisionMaker(){
  }

  public void initialize(){
  }

  public void doDecisions(){
  }

  public void setPneumaticsCompressorSubSystem(PneumaticsCompressor PneumaticsCompressorSys){
    m_PneumaticsCompressor = PneumaticsCompressorSys;
  }

  public void setShifterControlSubSystem(ShifterControl ShifterControlSys){
    m_ShifterControl = ShifterControlSys;
  }


}
