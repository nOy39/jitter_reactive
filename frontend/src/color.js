export default {
  bind(el, bindings, vnode) {

    const fontModifier = bindings.modifiers['font'];

    if (fontModifier) {
      el.style.fontSize = '48px';
    }
    let delay = 0;

    if (bindings.modifiers['delay']) {
      delay = 2000;
    }

    setTimeout(() => {
      const arg = bindings.arg;
      el.style[arg] = bindings.value;
    }, delay);
  }
}
