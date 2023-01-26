package frc.robot;

public class PneumaticsShifterTestTeleopDecisionMaker {
  private PneumaticsShifterTestJoystick m_TheJoystick = new PneumaticsShifterTestJoystick();

  private PneumaticsCompressor m_TheCompressor;
  private ShifterControl m_TheShifter;



  PneumaticsShifterTestTeleopDecisionMaker(){

  }

  public void initialize(){
  }

  public void doDecisions(){

    // System.out.println("-- F/B: " + m_TheJoystick.getForwardBackwardValue() + 
    //                    "   S/S: " + m_TheJoystick.getSideToSideValue() + 
    //                    "   Rot: " + m_TheJoystick.getTwistValue());


    if (m_TheJoystick.triggerReleaseEvent()){
      m_TheShifter.toggleGear();
      m_TheCompressor.enableAfterShift();
    }

    if (m_TheJoystick.button5ReleaseEvent()){
      //m_TheCompressor.toggleCompressor();
      m_TheCompressor.toggleCompressor();
    }
  }

  public void setPneumaticsCompressorSubSystem(PneumaticsCompressor PneumaticsCompressorSys){
    m_TheCompressor = PneumaticsCompressorSys;
  }

  public void setShifterControlSubSystem(ShifterControl ShifterControlSys){
    m_TheShifter = ShifterControlSys;
  }


}
