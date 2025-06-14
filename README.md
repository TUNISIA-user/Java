import React, { useEffect, useState } from 'react';

function App() {
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    // Wait for full load
    window.addEventListener('load', () => {
      const perf = window.performance.timing;
      const loadTime = perf.loadEventEnd - perf.navigationStart;

      console.log('App loaded in', loadTime, 'ms');

      // Optionally add a delay for better spinner effect
      setTimeout(() => {
        setLoading(false);
      }, loadTime); // or any custom delay like 300ms
    });
  }, []);

  if (loading) {
    return <div className="spinner">Loading App...</div>;
  }

  return <div>Your App Content</div>;
}
