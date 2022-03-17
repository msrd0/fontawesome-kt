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

/** Square Virus */
object FA_SQUARE_VIRUS: Icon {
	
	override val name get() = "Square Virus"
	
	override val unicode get() = "e578"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M160 224C160 206.3 174.3 192 192 192C209.7 192 224 206.3 224 224C224 241.7 209.7 256 192 256C174.3 256 160 241.7 160 224zM280 288C280 301.3 269.3 312 256 312C242.7 312 232 301.3 232 288C232 274.7 242.7 264 256 264C269.3 264 280 274.7 280 288zM384 32C419.3 32 448 60.65 448 96V416C448 451.3 419.3 480 384 480H64C28.65 480 0 451.3 0 416V96C0 60.65 28.65 32 64 32H384zM199.8 117.7C199.8 146.9 164.5 161.6 143.8 140.9C134.4 131.5 119.2 131.5 109.8 140.9C100.5 150.2 100.5 165.4 109.8 174.8C130.5 195.5 115.9 230.9 86.61 230.9C73.35 230.9 62.61 241.6 62.61 254.9C62.61 268.1 73.35 278.9 86.61 278.9C115.9 278.9 130.5 314.3 109.8 334.9C100.5 344.3 100.5 359.5 109.8 368.9C119.2 378.3 134.4 378.3 143.8 368.9C164.5 348.2 199.8 362.9 199.8 392.1C199.8 405.4 210.6 416.1 223.8 416.1C237.1 416.1 247.8 405.4 247.8 392.1C247.8 362.9 283.2 348.2 303.9 368.9C313.3 378.3 328.5 378.3 337.8 368.9C347.2 359.5 347.2 344.3 337.8 334.9C317.2 314.3 331.8 278.9 361.1 278.9C374.3 278.9 385.1 268.1 385.1 254.9C385.1 241.6 374.3 230.9 361.1 230.9C331.8 230.9 317.2 195.5 337.8 174.8C347.2 165.4 347.2 150.2 337.8 140.9C328.5 131.5 313.3 131.5 303.9 140.9C283.2 161.6 247.8 146.9 247.8 117.7C247.8 104.4 237.1 93.65 223.8 93.65C210.6 93.65 199.8 104.4 199.8 117.7H199.8z"/></svg>"""
		else -> null
	}
	
}
