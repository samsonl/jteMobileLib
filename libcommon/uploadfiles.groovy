def call(global, config, p1, p2) {
  echo "GLOBAL: ${global}"
  echo "CONFIG: ${config}"
  echo "P1:${p1}"
  echo "P2:${p2}"
  echo "G:${global.A}"
  echo "C:${config.B}"
  
}

def call(p1,p2) {
  call(global, config, p1, p2)
}
