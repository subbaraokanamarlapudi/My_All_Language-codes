echo "please read the instruction carfully given below please press enter👇"
read
echo "🛑Before ping checking please press enter the ping was running please press control c to cancel🛑"
echo "🛑Now we were checking server of 1.1.1.1 in below🛑"
ping -w 1 1.1.1.1 > /dev/null ||echo "🛑Ping Failed to 1.1.1.1🛑"  && echo -e "✊ ping 1.1.1.1 server checking completed✊ \e[1;34m$(ping -w 2 1.1.1.1 | grep / | cut -d "/" -f 5)\e[0m"

echo "🛑Now we were checking server of 8.8.8.8🛑"
ping -w 1 8.8.8.8 > /dev/null||echo "🛑Ping Failed to 8.8.8.8🛑"  && echo -e "✊  ping 8.8.8.8 server checking completed✊ \e[1;34m$(ping -w 2 8.8.8.8 | grep / | cut -d "/" -f 5)\e[0m"

echo "🛑Now we were checking server of google🛑"
ping -w 1 www.google.com > /dev/null ||echo "🛑Ping Failed to google.com🛑"  && echo -e "✊ping google server checking completed✊ \e[1;34m$(ping -w 2 google.com | grep / | cut -d "/" -f 5)\e[0m"

echo "👍we were sucessfully completed ping server checking was completed👍"

