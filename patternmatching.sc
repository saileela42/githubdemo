def month(n:Int):String = n match
  {
  case 1=>"january"
  case 2=>"february"
  case 3=>"march"
  case 4=>"april"
  case 5=>"may"
  case 6=>"jume"
  case 7=>"july"
  case 8=>"august"
  case 9=>"september"
  case 10=>"october"
  case 11=>"november"
  case 12=>"december"
  case _=>"invalid argumnet"
}
month(5)
month(13)
month(0)