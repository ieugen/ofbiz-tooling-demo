(ns ofbiz-tooling
  (:import (org.apache.ofbiz.base.crypto HashCrypt)))


(comment


  (org.apache.ofbiz.base.crypto.HashCrypt/getHashType)
  ;; => "SHA"

  (HashCrypt/pbkdf2HashCrypt "PBKDF2WithHmacSHA256" "" "s3cret-pa$$word")
  ;; => "{PBKDF2-SHA256}10000$Wy03MywgLTMsIDc0LCA3NywgLTgwLCAtMTIzLCA1NSwgLTc1LCAtNDEsIDkxLCAxMjUsIC05LCA2\r\nLCAtNzEsIDI1LCAtOTJd$TlhGiKDUW5ZTYnnI5bEEK9MS6elAid4zQEqAViwXGO0="


  )