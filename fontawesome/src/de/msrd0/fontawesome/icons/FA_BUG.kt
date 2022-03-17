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

/** Bug */
object FA_BUG: Icon {
	
	override val name get() = "Bug"
	
	override val unicode get() = "f188"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M352 96V99.56C352 115.3 339.3 128 323.6 128H188.4C172.7 128 159.1 115.3 159.1 99.56V96C159.1 42.98 202.1 0 255.1 0C309 0 352 42.98 352 96zM41.37 105.4C53.87 92.88 74.13 92.88 86.63 105.4L150.6 169.4C151.3 170 151.9 170.7 152.5 171.4C166.8 164.1 182.9 160 199.1 160H312C329.1 160 345.2 164.1 359.5 171.4C360.1 170.7 360.7 170 361.4 169.4L425.4 105.4C437.9 92.88 458.1 92.88 470.6 105.4C483.1 117.9 483.1 138.1 470.6 150.6L406.6 214.6C405.1 215.3 405.3 215.9 404.6 216.5C410.7 228.5 414.6 241.9 415.7 256H480C497.7 256 512 270.3 512 288C512 305.7 497.7 320 480 320H416C416 344.6 410.5 367.8 400.6 388.6C402.7 389.9 404.8 391.5 406.6 393.4L470.6 457.4C483.1 469.9 483.1 490.1 470.6 502.6C458.1 515.1 437.9 515.1 425.4 502.6L362.3 439.6C337.8 461.4 306.5 475.8 272 479.2V240C272 231.2 264.8 224 255.1 224C247.2 224 239.1 231.2 239.1 240V479.2C205.5 475.8 174.2 461.4 149.7 439.6L86.63 502.6C74.13 515.1 53.87 515.1 41.37 502.6C28.88 490.1 28.88 469.9 41.37 457.4L105.4 393.4C107.2 391.5 109.3 389.9 111.4 388.6C101.5 367.8 96 344.6 96 320H32C14.33 320 0 305.7 0 288C0 270.3 14.33 256 32 256H96.3C97.38 241.9 101.3 228.5 107.4 216.5C106.7 215.9 106 215.3 105.4 214.6L41.37 150.6C28.88 138.1 28.88 117.9 41.37 105.4H41.37z"/></svg>"""
		else -> null
	}
	
}
