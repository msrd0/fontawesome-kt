/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_HANDS_WASH: Icon {
	
	override val name get() = "Hands Wash"
	
	override val unicode get() = "e05e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M496,224a48,48,0,1,0-48-48A48,48,0,0,0,496,224ZM311.47,178.45A56.77,56.77,0,0,1,328,176a56,56,0,0,1,19,3.49l15.35-48.61A24,24,0,0,0,342,99.74c-11.53-1.35-22.21,6.44-25.71,17.51l-20.9,66.17ZM93.65,386.33c.8-.19,1.54-.54,2.35-.71V359.93a156,156,0,0,1,107.06-148l73.7-22.76L310.92,81.05a24,24,0,0,0-20.33-31.11c-11.53-1.34-22.22,6.45-25.72,17.52L231.42,173.88a8,8,0,0,1-15.26-4.83L259.53,31.26A24,24,0,0,0,239.2.15C227.67-1.19,217,6.6,213.49,17.66L165.56,169.37a8,8,0,1,1-15.26-4.82l38.56-122a24,24,0,0,0-20.33-31.11C157,10,146.32,17.83,142.82,28.9l-60,189.85L80.76,168.7A24,24,0,0,0,56.9,144.55c-13.23-.05-24.72,10.54-24.9,23.86V281.14A123.69,123.69,0,0,0,93.65,386.33ZM519.1,336H360a8,8,0,0,1,0-16H488a24,24,0,0,0,23.54-28.76C509.35,279.84,498.71,272,487.1,272H288l47.09-17.06a24,24,0,0,0-14.18-45.88L213.19,242.31A123.88,123.88,0,0,0,128,360v25.65a79.78,79.78,0,0,1,58,108.63A118.9,118.9,0,0,0,248,512H456a24,24,0,0,0,23.54-28.76C477.35,471.84,466.71,464,455.1,464H360a8,8,0,0,1,0-16H488a24,24,0,0,0,23.54-28.76C509.35,407.84,498.71,400,487.1,400H360a8,8,0,0,1,0-16H520a24,24,0,0,0,23.54-28.76C541.35,343.84,530.71,336,519.1,336ZM416,64a32,32,0,1,0-32-32A32,32,0,0,0,416,64ZM112,416a48,48,0,1,0,48,48A48,48,0,0,0,112,416Z"/></svg>"""
		else -> null
	}
	
}
