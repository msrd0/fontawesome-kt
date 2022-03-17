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

object FA_HEAD_SIDE_COUGH_SLASH: Icon {
	
	override val name get() = "Head Side-cough-slash"
	
	override val unicode get() = "e062"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M607.1 311.1c13.25 0 24-10.75 24-23.1s-10.75-23.1-24-23.1s-23.1 10.75-23.1 23.1S594.7 311.1 607.1 311.1zM607.1 407.1c13.25 0 24-10.78 24-24.03c0-13.25-10.75-23.1-24-23.1s-24 10.78-24 24.03C583.1 397.2 594.7 407.1 607.1 407.1zM630.8 469.1l-190.2-149.1h7.4c23.12 0 38.62-23.87 29.25-44.1c-20.1-47.12-48.49-151.7-73.11-186.7C365.6 33.63 302.5 0 234.1 0H192C149.9 0 111.5 14.26 79.88 37.29L38.81 5.109C34.41 1.672 29.19 0 24.03 0C16.91 0 9.845 3.156 5.126 9.187c-8.187 10.44-6.375 25.53 4.062 33.7l591.1 463.1c10.5 8.203 25.56 6.328 33.69-4.078C643.1 492.4 641.2 477.3 630.8 469.1zM320 415.1c-17.67 0-31.1-14.33-31.1-31.1S302.3 351.1 320 351.1l5.758-.0009L18.16 110.9C6.631 135.6 .0006 162.1 .0006 191.1c0 56.75 24.75 107.6 64 142.9L64 511.1h223.1l0-31.1l64.01 .001c33.25 0 60.2-25.38 63.37-57.78l-7.932-6.217H320zM543.1 359.1c13.25 0 24-10.78 24-24.03s-10.75-23.1-24-23.1c-13.25 0-24 10.78-24 24.03C519.1 349.2 530.7 359.1 543.1 359.1z"/></svg>"""
		else -> null
	}
	
}
