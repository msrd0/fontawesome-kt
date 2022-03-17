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

object FA_TARP_DROPLET: Icon {
	
	override val name get() = "Tarp Droplet"
	
	override val unicode get() = "e57c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M224 100C224 75.95 257.7 29.93 276.2 6.49C282.3-1.226 293.7-1.226 299.8 6.49C318.3 29.93 352 75.95 352 100C352 133.1 323.3 160 288 160C252.7 160 224 133.1 224 100V100zM64 128H197.5C210.6 165.3 246.2 192 288 192C329.8 192 365.4 165.3 378.5 128H512C547.3 128 576 156.7 576 192V352H448C430.3 352 416 366.3 416 384V512H64C28.65 512 0 483.3 0 448V192C0 156.7 28.65 128 64 128V128zM96 256C113.7 256 128 241.7 128 224C128 206.3 113.7 192 96 192C78.33 192 64 206.3 64 224C64 241.7 78.33 256 96 256zM448 512V384H576L448 512z"/></svg>"""
		else -> null
	}
	
}
