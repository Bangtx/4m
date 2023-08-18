// hooks/useTokenValidation.js
import { getCookie } from "@/commons/format";
import { useEffect, useState } from "react";

const useTokenValidation = () => {
  const [tokenValid, setTokenValid] = useState(false);
  const [isLoading, setIsLoading] = useState(true);

  useEffect(() => {
    setIsLoading(true);
    const storedToken = getCookie("token");

    if (!storedToken || storedToken === "") {
      setIsLoading(false);
      return;
    }

    setTokenValid(true)    
    setIsLoading(false);
  }, [tokenValid]);

  return { tokenValid, isLoading };
};

export default useTokenValidation;
