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

object FA_HANDSHAKE_ALTERNATE_SLASH: Icon {
	
	override val name get() = "Handshake Alternate Slash"
	
	override val unicode get() = "e05f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M358.59,195.6,504.2,313.8a63.4,63.4,0,0,1,22.21,37.91H624a16.05,16.05,0,0,0,16-16V143.91A16,16,0,0,0,624,128H512L457.41,73.41A32,32,0,0,0,434.8,64H348.91a32,32,0,0,0-21.61,8.41l-88.12,80.68-25.69-19.85L289.09,64H205.3a32,32,0,0,0-22.6,9.41l-20.34,20.3L45.47,3.38A16,16,0,0,0,23,6.19L3.38,31.46A16,16,0,0,0,6.19,53.91L594.54,508.63A16,16,0,0,0,617,505.82l19.64-25.27a16,16,0,0,0-2.81-22.45L303.4,202.72l32.69-29.92,27-24.7a16,16,0,0,1,21.61,23.61ZM16,128A16.05,16.05,0,0,0,0,144V335.91a16,16,0,0,0,16,16H146.3l90.5,81.89a64,64,0,0,0,90-9.3l.2-.2,17.91,15.5a37.16,37.16,0,0,0,52.29-5.39l8.8-10.82L23.56,128Z"/></svg>"""
		else -> null
	}
	
}
